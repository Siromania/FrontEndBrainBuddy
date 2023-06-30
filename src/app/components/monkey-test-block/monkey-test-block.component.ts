import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-monkey-test-block',
  templateUrl: './monkey-test-block.component.html',
  styleUrls: ['./monkey-test-block.component.scss']
})
export class MonkeyTestBlockComponent {
  number : string = "1";
  @Input() x : number | undefined;
  @Input() y : number | undefined;

}
