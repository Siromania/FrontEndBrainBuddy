import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MonkeyTestGridComponent } from './monkey-test-grid.component';

describe('MonkeyTestGridComponent', () => {
  let component: MonkeyTestGridComponent;
  let fixture: ComponentFixture<MonkeyTestGridComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [MonkeyTestGridComponent]
    });
    fixture = TestBed.createComponent(MonkeyTestGridComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
