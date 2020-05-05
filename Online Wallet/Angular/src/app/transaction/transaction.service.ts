import { Injectable } from '@angular/core';
import { transaction } from './transaction';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TransactionService {
  
  url="http://localhost:9060/wallet/showTransactions";

  constructor(private http:HttpClient) { }
  /*
  transaction(id:Number):Observable<any> {
    return this.http.get(`${this.url}/${id}`)
   }*/
   
   getHistoryList(UserId): Observable<any> {
    
    return this.http.get(`${this.url}/${UserId}`)
  }
}



       
      