import { Injectable } from '@angular/core';
import { removeDebugNodeFromIndex } from '@angular/core/src/debug/debug_node';
import { resolve } from 'q';
import { RouteConfigLoadStart } from '@angular/router';

const colors: any = {
  red: '#F1948A',
  blue: '#AED6F1',
  yellow: '#F7DC6F'
};

const EVENTS = [
  { id: '1',
    title: 'Install Angular CLI',
    color: colors.red,
    start: '',
    end: ''
  },
  { id: '2',
    title: 'Style app',
    color: colors.blue,
    start: '',
    end: ''
  },
  { id: '3',
    title: 'Setup API',
    color: colors.yellow,
    start: '',
    end: ''
  },
];

@Injectable({
  providedIn: 'root'
})
export class EventService {

  constructor() { }

  get(){
    return new Promise(resolve => resolve(EVENTS));
  }

  add(data){
    return new Promise(resolve =>{
      EVENTS.push(data);
      resolve(data);
    });
  }

  delete(selected){
    return new Promise(resolve => {
      const index = EVENTS.findIndex( event => event === selected);
      EVENTS.splice(index, 1);
      resolve(true);
    });
  }

}
