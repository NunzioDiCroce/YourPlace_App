import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { FooterComponent } from './components/footer/footer.component';
import { HomeComponent } from './components/home/home.component';
import { ReservationsComponent } from './components/reservations/reservations.component';
import { ReservationCreateComponent } from './components/reservation-create/reservation-create.component';
import { ReservationDetailsComponent } from './components/reservation-details/reservation-details.component';
import { ReservationUpdateComponent } from './components/reservation-update/reservation-update.component';
import { PlacesComponent } from './components/places/places.component';
import { PlaceCreateComponent } from './components/place-create/place-create.component';
import { PlaceDetailsComponent } from './components/place-details/place-details.component';
import { PlaceUpdateComponent } from './components/place-update/place-update.component';
import { UsersComponent } from './components/users/users.component';
import { UserDetailsComponent } from './components/user-details/user-details.component';
import { ProfileComponent } from './components/profile/profile.component';
import { ProfileUpdateComponent } from './components/profile-update/profile-update.component';
import { RegisterComponent } from './auth/register/register.component';
import { LoginComponent } from './auth/login/login.component';
import { Route, RouterModule } from '@angular/router';
import { AuthGuard } from './auth/auth.guard';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

// - - - - - - routes configuration - - - - - -
const routes: Route[] = [
  { path: '', component: HomeComponent },

  { path: 'register', component: RegisterComponent },
  { path: 'login', component: LoginComponent },

  { path: 'reservations', component: ReservationsComponent, canActivate: [AuthGuard] },
  { path: 'reservationCreate', component: ReservationCreateComponent, canActivate: [AuthGuard] },
  { path: 'reservations/:id', component: ReservationDetailsComponent, canActivate: [AuthGuard] },
  { path: 'reservationUpdate/:id', component: ReservationUpdateComponent, canActivate: [AuthGuard] },

  { path: 'places', component: PlacesComponent, canActivate: [AuthGuard] },
  { path: 'placeCreate', component: PlaceCreateComponent, canActivate: [AuthGuard] },
  { path: 'places/:id', component: PlaceDetailsComponent, canActivate: [AuthGuard] },
  { path: 'placeUpdate/:id', component: PlaceUpdateComponent, canActivate: [AuthGuard] },

  { path: 'users', component: UsersComponent, canActivate: [AuthGuard] },
  { path: 'users/:id', component: UserDetailsComponent, canActivate: [AuthGuard] },
  { path: 'profile', component: ProfileComponent, canActivate: [AuthGuard] },
  { path: 'profileUpdate', component: ProfileUpdateComponent, canActivate: [AuthGuard] },

  { path: '**', redirectTo: ''}
];


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    FooterComponent,
    HomeComponent,
    ReservationsComponent,
    ReservationCreateComponent,
    ReservationDetailsComponent,
    ReservationUpdateComponent,
    PlacesComponent,
    PlaceCreateComponent,
    PlaceDetailsComponent,
    PlaceUpdateComponent,
    UsersComponent,
    UserDetailsComponent,
    ProfileComponent,
    ProfileUpdateComponent,
    RegisterComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,

    // - - - - - - additional imports - - - - -
    RouterModule.forRoot(routes),
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
