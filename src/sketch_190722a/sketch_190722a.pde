import ddf.minim.*;     //at the top of the sketch
Minim minim;     //at the top of the sketch
AudioPlayer sound;    //at the top of the sketch
 PImage chicken;
 PImage pineapple;


 
void setup(){
  size(600,600);
  chicken = loadImage("grilledchicken.png");
  pineapple = loadImage("P2.jpeg");
    chicken.resize(150,150);
pineapple.resize(150,150);
minim = new Minim(this);      //in the setup method

 
}

void draw(){
 fill(135,54,0);
 ellipse(300,300,500,500);
 fill(231,76,60);
 ellipse(300,300,450,450);
 fill(247,220,111);
 ellipse(300,300,430,430);
 sound = minim.loadFile("duubstep.wav");      //in the setup method
 if(mousePressed){
   sound.play();
   sound.rewind();
 image(chicken,250,250);
 image(pineapple,150,150);
 }
}
