import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { DropdownModule } from 'primeng/dropdown';
import { ButtonModule } from 'primeng/button';
import { TableModule } from 'primeng/table';
import { AppComponent } from 'app/components/app.component';



@NgModule({
  declarations: [
		AppComponent
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
		ButtonModule,
		TableModule,
		
  ],
  providers: [

	],
  bootstrap: [AppComponent],
	entryComponents: []
})
export class AppModule {}