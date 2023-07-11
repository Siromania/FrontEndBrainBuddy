import { Component, EventEmitter, HostListener, Input, Output } from '@angular/core';

@Component({
  selector: 'app-monkey-test-block',
  templateUrl: './monkey-test-block.component.html',
  styleUrls: ['./monkey-test-block.component.scss']
})
export class MonkeyTestBlockComponent {
  numberOrder : string = "1";
  @Input() x : number | undefined;
  @Input() y : number | undefined;
  @Output() onSelectValue = new EventEmitter<{xValue: any , yValue: any}>();

  // onClickEmit() {
  //   this.onSelectValue.emit( {xValue: this.x, yValue:this.y} );
  // }

  @HostListener('click', ['$event.target']) onClick() {
    console.log("x="+this.x+" y="+this.y);
    this.onSelectValue.emit( {xValue: this.x, yValue:this.y} );
  }

}
