import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-monkey-test-grid',
  templateUrl: './monkey-test-grid.component.html',
  styleUrls: ['./monkey-test-grid.component.scss']
})
export class MonkeyTestGridComponent implements OnInit {

  maxSize : number = 9;
  round : number = 5;
  listRow : number[] = [1,2,3,4,5,6,7,8,9];
  listColumn : number[] = [1,2,3,4,5,6,7,8,9];
  rowX : any = 0;
  columnY : any = 0;
  listRandom : any = [];
  currentRound : number = 0;

  ngOnInit(): void {
    console.log(this.random());
    for(let i = 1; i<this.round;++i){
      let myVar : any[]= [{ 
          "x": this.random(),
          "y": this.random()
      }]
      this.listRandom.push(myVar);
    }
    console.log(this.listRandom);

  }

  random(){
    return Math.floor(Math.random() * this.maxSize+1);
  }

  selectValue( newValue : any ) {
    console.log(newValue);
    console.log(this.listRandom[0][0]);
    for(let i = 0;i<this.listRandom.length;++i){
      if(newValue.xValue === this.listRandom[i][0].x && newValue.yValue === this.listRandom[i][0].y){
        console.log("right");
      }
    }
  }



}
