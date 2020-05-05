import { Component, OnInit } from '@angular/core';
import { TransactionService } from './transaction.service';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { transaction } from './transaction';

@Component({
  selector: 'app-transaction',
  templateUrl: './transaction.component.html',
  styleUrls: ['./transaction.component.css']
})
export class TransactionComponent implements OnInit {

  history:Observable<transaction[]>;
  UserId:Number;
  constructor(private service:TransactionService,private router:Router) { }

  ngOnInit(): void {
    
    //this.history=this.service.getHistoryList(sessionStorage.getItem('UserId'));
   
    
     this.service.getHistoryList(sessionStorage.getItem('UserId')).subscribe(
     // this.service.showBalance(sessionStorage.getItem('UserId')).subscribe(
    //get se use karke calling url
    data=>{
  this.history=data;
  
    },
    error=>{
      console.log(error);
    }

     );

  }
  

}
