import { Routes } from "@angular/router";
import { LoginComponent } from "../pages/login/login.component";
import { NotFoundPage } from "../pages/not-found/not-found.component";
import { StorageComponent } from "../pages/storage/storage.component";

export const routes: Routes = [
  { path: "login", component: LoginComponent },
  { path: "storage", component: StorageComponent },
  { path: "", redirectTo: "/login", pathMatch: "full" },
  { path: "**", component: NotFoundPage },
];
