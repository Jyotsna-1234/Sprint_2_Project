import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-my-wallet',
  templateUrl: './my-wallet.component.html',
  styleUrls: ['./my-wallet.component.css']
})
export class MyWalletComponent implements OnInit {
  

  accountStatus=sessionStorage.getItem('userStatus');
  constructor() {
    sessionStorage.setItem('userId','101');
  sessionStorage.setItem('accountId','201');
  sessionStorage.setItem('userStatus','accepted');
   }

  ngOnInit(): void {

    console.log(this.accountStatus);
  }

}
