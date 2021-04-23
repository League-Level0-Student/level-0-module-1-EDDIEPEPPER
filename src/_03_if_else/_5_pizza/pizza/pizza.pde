
void setup() {
  PImage pepperoni;
  PImage olive;
  PImage mushroom;
 
  
  
  pepperoni = loadImage("pepperoni.png");
  olive = loadImage("olive.png");
 mushroom = loadImage("mushroom.png");
  
  size(800,800);
    fill(#F2DF98);
    ellipse(300,300,300,300);
    fill(#F53F2F);
    ellipse(300,300,290,290);
    fill(#FFEE52);
    ellipse(300,300,270,270);
     image(pepperoni,200,200);
      image(olive,270,200);
       image(mushroom,330,330);
        image(pepperoni,267,278);
        image(pepperoni,239,300);
        image(pepperoni,200,200);
        image(olive,270,230);
        image(mushroom,290,290);
        image(mushroom,189,234);
        
}
void draw() {
    
}
