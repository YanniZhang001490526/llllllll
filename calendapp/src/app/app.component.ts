import { Component, OnInit } from '@angular/core';
import * as moment from 'moment';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit{
  title = 'calendapp';

  public date = moment();
  public dayArray;

  ngOnInit(){
    this.dayArray = this.getDays(this.date);
  }

  setToday(day){
     if(!day){
       return false;
     }
     return moment().format('L')=== day.format('L');
  }

  getDays(month){
    let firstDay = moment(month).startOf("M");
    let days = Array.apply(null, {length:month.daysInMonth()})
    .map(Number.call,Number)
    .map((n)=>{
      return moment(firstDay).add(n,'d');
    });
    
    for(let i=0;i<firstDay.weekday();i++){
      days.unshift(null);
    }
    return days;
  }

  nextMonth(){
   this.date.add(1,'M');
   this.dayArray = this.getDays(this.date);
  }
  previousMonth(){
    this.date.subtract(1,'M');
    this.dayArray = this.getDays(this.date);
  }

}
