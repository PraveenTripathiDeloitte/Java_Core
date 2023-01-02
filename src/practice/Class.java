package practice;

public class Class {
    private String roomNumber;
    private String floorNumber;
    private String blockNumber;

    public Class(String roomNumber, String floorNumber, String blockNumber) {
        this.roomNumber = roomNumber;
        this.floorNumber = floorNumber;
        this.blockNumber = blockNumber;
    }

    public Class(String floorNumber, String blockNumber) {
        this.floorNumber = floorNumber;
        this.blockNumber = blockNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    public String getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(String blockNumber) {
        this.blockNumber = blockNumber;
    }
}
