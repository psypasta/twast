import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import {AppComponent} from './app.component';
import { ButtonModuleComponent } from './button-module/button-module.component';

@NgModule({
  declarations: [
    AppComponent,
    ButtonModuleComponent,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
