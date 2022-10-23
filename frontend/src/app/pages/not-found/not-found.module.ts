import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";

import { NotFoundPage } from "./not-found.component";

@NgModule({
  declarations: [NotFoundPage],
  imports: [BrowserModule],
  exports: [NotFoundPage],
  bootstrap: [NotFoundPage],
})
export class NotFoundModule {}
