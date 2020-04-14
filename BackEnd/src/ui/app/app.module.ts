import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { DropdownModule } from 'primeng/dropdown';

@NgModule({
  declarations: [

  ],
  imports: [
    BrowserModule,
		BrowserAnimationsModule,
    CommonModule,
    FormsModule,
		RouterModule,
		HttpClientModule,
    ReactiveFormsModule,
		DropdownModule,
  ],
  providers: [

	],
  bootstrap: []
})
export class AppModule {}