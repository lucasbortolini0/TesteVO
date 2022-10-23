import { NgModule } from "@angular/core";
import { LoginModule } from "./login/login.module";
import { NotFoundModule } from "./not-found/not-found.module";
import { StorageModule } from "./storage/storage.module";

@NgModule({
  declarations: [],
  imports: [LoginModule, NotFoundModule, StorageModule],
  exports: [LoginModule, NotFoundModule, StorageModule],
})
export class PageModule {}
