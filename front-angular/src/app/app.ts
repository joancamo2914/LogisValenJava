import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { VistaLiderLogistica } from './lider-logistica/components/vista-lider-logistica/vista-lider-logistica';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet],
  templateUrl: './app.html',
  styleUrl: './app.css'
})


export class App {
  protected title = 'front-angular';
}
