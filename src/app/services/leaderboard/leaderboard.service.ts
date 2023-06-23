import { Injectable } from '@angular/core';
import { Observable, map } from 'rxjs';
import { ChartTest } from 'src/app/entities/chart';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LeaderboardService {
  
  constructor(private http: HttpClient) { }

  getChart(): Observable<ChartTest> {
    const uri: string = '/assets/data/chart.json';
    return this.http.get<ChartTest>(uri);
  }
}
