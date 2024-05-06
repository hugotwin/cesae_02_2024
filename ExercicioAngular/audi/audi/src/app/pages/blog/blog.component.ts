import {Component, Input} from '@angular/core';
import {PostComponent} from "./post/post.component";
import {SectionComponent} from "./section/section.component";

@Component({
  selector: 'app-blog',
  standalone: true,
  imports: [
    PostComponent,
    SectionComponent
  ],
  templateUrl: './blog.component.html',
  styleUrl: './blog.component.css'
})
export class BlogComponent {

  titleBlog :string ="Title post";
  textBlog :string ="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vestibulum, ipsum nec tincidunt sollicitudin, nulla libero venenatis libero,";

  contentPost1: string =" This blog post shows a few different types of content that’s supported and styled with Bootstrap. Basic typography, lists, tables, images, code, and more are all supported as expected.\nThis is some additional paragraph placeholder content. It has been written to fill the available space and show how a longer snippet of text affects the surrounding content. We'll repeat it often to keep the demonstration flowing, so be on the lookout for this exact same string of text.</p>";
  datePost1: string ="January 1, 2021 by";
   writterPost1: string ="Mark";

  contentPost2: string =" This blog post shows a few different types of content that’s supported and styled with Bootstrap. Basic typography, lists, tables, images, code, and more are all supported as expected.\nThis is some additional paragraph placeholder content. It has been written to fill the available space and show how a longer snippet of text affects the surrounding content. We'll repeat it often to keep the demonstration flowing, so be on the lookout for this exact same string of text.</p>";
  datePost2: string ="May 1, 2022 by";
  writterPost2: string ="Hugo";




}
