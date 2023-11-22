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
    ProfileUpdateComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
