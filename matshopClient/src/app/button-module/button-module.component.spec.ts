import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ButtonModuleComponent } from './button-module.component';

describe('ButtonModuleComponent', () => {
  let component: ButtonModuleComponent;
  let fixture: ComponentFixture<ButtonModuleComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ButtonModuleComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ButtonModuleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
