import { EventService } from './event.service';
import { Component, OnInit, Input } from '@angular/core';
import {FormBuilder,FormControl, FormGroup, Validators} from '@angular/forms';
import * as moment from 'moment';
import { getLocaleDateTimeFormat } from '@angular/common';

const colors: any = {
  red: '#ad2121',
  blue: '#1e90ff',
  yellow: '#e3bc08'
};

@Component({
  selector: 'app-eventmanage',
  templateUrl: './eventmanage.component.html',
  styleUrls: ['./eventmanage.component.scss'],
  providers: [EventService]
})
export class EventmanageComponent implements OnInit {

  private events;
  private activeEvents;
  public dateForm :FormGroup;

  constructor(private eventService: EventService, private fb: FormBuilder) {
    this.initDateForm();
   }

   initDateForm(){
    return this.dateForm = this.fb.group({
      dateFrom:[null,Validators.required],
      dateTo:[null, Validators.required]
    })
  }

  getEvents(){
    return this.eventService.get().then(events => {
      this.events = events;
    })
  }

  ngOnInit() {
    this.getEvents();
  }

  private title;
  private id;
  

  

  destroyEvent(event){
    this.eventService.delete(event).then(() => {
      return this.getEvents();
    });
  }
/////separarte 
  settime(event){
    
  }


  
  public addEvent(){
    
    if(!this.dateForm.valid){
      return;
    }

   let dateFrom = moment(this.dateForm.value.dateFrom, 'MM/DD/YYYY');
   let dateTo = moment(this.dateForm.value.dateTo, 'MM/DD/YYYY');
   
    this.eventService.add({ id:this.id,title: this.title, color: colors.blue, start: dateFrom.format('MMMM/DD/YYYY'), end: dateTo.format('MMMM/DD/YYYY')}).then(() => {
      return this.getEvents();
    }).then(() => {
    })
    
  }

  public selectDate(day){
    let dayFormatted = day.format('MM/DD/YYYY');
    if(this.dateForm.valid){
      this.dateForm.setValue({dateFrom: null, dateTo:null});
      return;
    }
    if(!this.dateForm.get('dateFrom').value){
      this.dateForm.get('dateFrom').patchValue(dayFormatted);
    }
    else{
      this.dateForm.get('dateTo').patchValue(dayFormatted);
      
    }
 }

 public isSelected(day){
   if(!day){
     return false;
   }
   let dateFrom = moment(this.dateForm.value.dateFrom, 'MM/DD/YYYY');
   let dateTo = moment(this.dateForm.value.dateTo, 'MM/DD/YYYY');
   if(this.dateForm.valid){
      return dateFrom.isSameOrBefore(day) && dateTo.isSameOrAfter(day);
   }
   if(this.dateForm.get('dateFrom').valid){
     return dateFrom.isSame(day);
   }
 }

}
