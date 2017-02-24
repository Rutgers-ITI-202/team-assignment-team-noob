/**
 *
An adventurer has:
 *A location (some room).
 *An inventory (the things being carried).  When the player executes the ¡°take thing¡± command, the item should be added to the inventory.
An adventurer can:
 *Move from room to room.
 *Carry a number of objects.
 *Pick up, drop, look at, and use various objects.
* @author Team Noob
* @version 1.0
* Group Assignment 1 
*/
public class Alex {
	private boolean smallKey = false; // all the stuffs that are used for chapter 1
	private boolean box = false;
	private boolean WeddingPhoto = false;
	private boolean brush = false;
	private boolean mountainPhoto = false;
	private boolean roomkey = false;

	public Alex(){
	}
		public void akey(boolean key){ // this is the boolean while if the case is yes, story can keep going.
			this.smallKey =!this.smallKey ;		
		}
		public boolean getsmallKey(){
			return smallKey ;
		}
		public void abox (boolean box){
			this.box= !this.box;
		}
		public boolean LookatBox(){
			return box;
		}
		public void aWeddingPhoto (boolean WeddingPhoto){
			this.WeddingPhoto=! this.WeddingPhoto;
		}
		public boolean LookatWeddingPhoto(){
			return WeddingPhoto;
		}
		public void aBrush (boolean brush){
			this.brush=!this.brush;
		}
		public boolean GetBrush(){
			return brush;
		}
		public void amountainPhoto(boolean mountainPhoto){
			this.mountainPhoto=!this.mountainPhoto;
		}
		public boolean LookatMountain(){
			return mountainPhoto;
		}
		public void aRoomKey (boolean roomkey){
			this.roomkey=!this.roomkey;
		}
		public boolean Getroomkey(){
			return roomkey;
		}
	}

