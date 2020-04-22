import { Injectable  } from '@angular/core';
import { HttpInterceptor, HttpRequest, HttpHandler, HttpEvent } from '@angular/common/http';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/do';
import { environment } from '../../environments/environment';

@Injectable()
export class BackEndInterceptor implements HttpInterceptor {
  
  constructor() {}

  intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    if(req.url && !req.url.startsWith('http') && !req.url.startsWith('/assets')) {
      req = req.clone( {
        url: environment.backend + req.url
      });
    }
    return next.handle(req).do(
      next => {
        console.log(next);
      },
      err => {
        console.log(err);
      }
    );
  }
}