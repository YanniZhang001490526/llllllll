import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EventmanageComponent } from './eventmanage.component';

describe('EventmanageComponent', () => {
  let component: EventmanageComponent;
  let fixture: ComponentFixture<EventmanageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EventmanageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EventmanageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
