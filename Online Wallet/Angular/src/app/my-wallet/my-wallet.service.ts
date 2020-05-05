import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MyWalletService {
    private balanceUrl="http://localhost:9060/wallet/showBalance";
    //private balanceUrl="http://localhost:9060/wallet/showBalance";
    private transactUrl="http://localhost:9060/wallet/showTransactions";
       
       showBalance(id:String):Observable<any> {
        return this.http.get(`${this.balanceUrl}/${id}`)
       }
       
       
      constructor(private http:HttpClient) {
    
      }
  }

