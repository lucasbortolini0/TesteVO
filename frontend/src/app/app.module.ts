import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";

import { AppRoutingModule } from "./app-routing.module";
import { AppComponent } from "./app.component";
import { NoopAnimationsModule } from "@angular/platform-browser/animations";
import { PageModule } from "./pages/pages.module";
import { StorageComponent } from "./pages/storage/storage.component";

@NgModule({
  declarations: [AppComponent],
  imports: [BrowserModule, AppRoutingModule, PageModule, NoopAnimationsModule],
  providers: [StorageComponent],
  bootstrap: [AppComponent],
})
export class AppModule {}
