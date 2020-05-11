import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MyWalletComponent } from './my-wallet/my-wallet.component';
import { MyTransactionsComponent } from './my-wallet/my-transactions/my-transactions.component';
import { ShowBalanceComponent } from './my-wallet/show-balance/show-balance.component';
import { TransactionItemComponent } from './my-wallet/my-transactions/transaction-item/transaction-item.component';
import { HttpClientModule } from '@angular/common/http';





@NgModule({
  declarations: [
    AppComponent,
    MyWalletComponent,
    MyTransactionsComponent,
    ShowBalanceComponent,
    TransactionItemComponent,
    
    
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
