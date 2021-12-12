interface Places
{
    public String Type;
    public int PlaceNo;
}

class PlaceToStay implements Places
{
    public String ID;
}

class Room extends PlaceToStay
{
    public String Type;
    public int PlaceNo;
    public String Quality;
}

class Pansiyon extends PlaceToStay
{
    public String Type;
    public int PlaceNo;
    public bool KitchenAvailability;
}