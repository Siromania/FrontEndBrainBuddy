import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MonkeyTestGameComponent } from './monkey-test-game.component';

describe('MonkeyTestGameComponent', () => {
  let component: MonkeyTestGameComponent;
  let fixture: ComponentFixture<MonkeyTestGameComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [MonkeyTestGameComponent]
    });
    fixture = TestBed.createComponent(MonkeyTestGameComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
