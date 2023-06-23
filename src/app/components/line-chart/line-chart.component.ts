import { Component, OnInit } from '@angular/core';
import { Chart } from 'chart.js';
import { LeaderboardService } from 'src/app/services/leaderboard/leaderboard.service';

@Component({
  selector: 'app-line-chart',
  templateUrl: './line-chart.component.html',
  styleUrls: ['./line-chart.component.scss']
})
export class LineChartComponent implements OnInit {
  public chart: any;

  constructor(public service: LeaderboardService) {}

  ngOnInit(): void {
    this.service.getChart().subscribe((response) => {
      
      this.chart = response.history;
      const ctx = document.getElementById('MyChart');

      new Chart("MyChart", {
        type: 'bar',
        data: {
          datasets: [{
            data: [{x: 10, y: 20}, {x: 15, y: null}, {x: 20, y: 10}]
          }]
        },
        options: {
          scales: {
            y: {
              beginAtZero: true
            }
          }
        }
      });
      console.log(response.history);
    });
  }
}
