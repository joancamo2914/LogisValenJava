import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VistaLiderLogistica } from './vista-lider-logistica';

describe('VistaLiderLogistica', () => {
  let component: VistaLiderLogistica;
  let fixture: ComponentFixture<VistaLiderLogistica>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [VistaLiderLogistica]
    })
    .compileComponents();

    fixture = TestBed.createComponent(VistaLiderLogistica);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
