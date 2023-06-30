import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MonkeyTestBlockComponent } from './monkey-test-block.component';

describe('MonkeyTestBlockComponent', () => {
  let component: MonkeyTestBlockComponent;
  let fixture: ComponentFixture<MonkeyTestBlockComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [MonkeyTestBlockComponent]
    });
    fixture = TestBed.createComponent(MonkeyTestBlockComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
