import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Inscription } from 'src/app/entities/inscription';
import { User } from 'src/app/entities/user';

@Injectable({
  providedIn: 'root'
})
export class ConnexionService {

  connexionUrl: string = 'http://localhost:8080/users';

  constructor(private httpClient: HttpClient) { }

  createUser(user: Inscription): Observable<Inscription>  {
    return this.httpClient.post<Inscription>(this.connexionUrl, user)
    
      
  }
  
  getUsers(): Observable<User[]> {
	  return this.httpClient.get<User[]>(this.connexionUrl);
  }
}
