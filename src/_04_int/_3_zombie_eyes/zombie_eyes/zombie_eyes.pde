
void setup() {
PImage face = loadImage("corgi.jpg");
size(500,500);

face.resize(500,500);
image(face, 0, 0);
}
void draw() {
fill(mouseX,mouseY,mouseX);
ellipse(239,150,10,10);

ellipse(313,180,10,10);
fill(#000000);
ellipse(313,180,5,5);

ellipse(239,150,5,5);
}
