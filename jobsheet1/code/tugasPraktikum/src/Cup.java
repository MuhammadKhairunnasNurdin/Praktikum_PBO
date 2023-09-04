public class Cup {
    private String material, content;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void printInfo() {
        System.out.println("Chair Color\t: " + material + "\nCondition\t: " + content);
    }
}
