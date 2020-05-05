import { Component, OnInit } from '@angular/core';
import { MyWalletService } from './my-wallet.service';
import { Router } from '@angular/router';
import { ThrowStmt } from '@angular/compiler';


@Component({
  selector: 'app-my-wallet',
  templateUrl: './my-wallet.component.html',
  styleUrls: ['./my-wallet.component.css']
})
export class MyWalletComponent implements OnInit {

  balance:Number
  UserId:Number
 
  
  
  constructor(private service:MyWalletService,private router:Router)
   
  { 
   }


  ngOnInit(): void {
sessionStorage.setItem('UserId','102')
    this.showBalance()
  }

  showBalance() {
this.service.showBalance(sessionStorage.getItem('UserId')).subscribe(
  data=>{
    console.log(data)
    this.balance=data 
  },
  error=>console.log(error)
)
  }
  
  


}
