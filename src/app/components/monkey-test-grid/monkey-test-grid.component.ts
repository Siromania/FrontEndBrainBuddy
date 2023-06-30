import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-monkey-test-grid',
  templateUrl: './monkey-test-grid.component.html',
  styleUrls: ['./monkey-test-grid.component.scss']
})
export class MonkeyTestGridComponent implements OnInit {

  maxSize : number = 10;
  round : number = 5;
  listRow : number[] = [1,2,3,4,5,6,7,8,9];
  listColumn : number[] = [1,2,3,4,5,6,7,8,9];
  
  ngOnInit(): void {
   
    console.log(this.random());

    for(let i = 0; i<this.round;++i){
      console.log("x="+this.random()+" y="+this.random());

    }

  }

  random(){
    return Math.floor(Math.random() * this.maxSize);
  }



}
