import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/entities/user';
import { DonneepersoService } from 'src/app/services/donneeperso/donneeperso.service';

@Component({
  selector: 'app-donneeperso',
  templateUrl: './donneeperso.component.html',
  styleUrls: ['./donneeperso.component.scss']
})
export class DonneepersoComponent implements OnInit {

  donnee: User | undefined;

  constructor(private donneepersoService: DonneepersoService) {
	  
  }

  ngOnInit(): void {
    this.donneepersoService.getUserData()
      .subscribe({
        next: (res: User) => {
          this.donnee = res;
      },
      error: () => alert("Something went wrong")
    });

      
  }



}
