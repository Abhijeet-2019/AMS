import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AmsTabComponent } from './ams-tab.component';

describe('AmsTabComponent', () => {
  let component: AmsTabComponent;
  let fixture: ComponentFixture<AmsTabComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AmsTabComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AmsTabComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
