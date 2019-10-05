PImage rainbow;
PImage unicorn;

void setup() {
  rainbow = loadImage("rainbow.png");
size(1000, 1000);
rainbow.resize(width,height);
unicorn = loadImage("unicorn.png");
unicorn.resize(width,height);
}

void draw() {
  background(rainbow);
  image(unicorn, mouseX -600,mouseY -600);
}
