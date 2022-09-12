package other;

public class ContainerWithMostWater { public int maxArea(int[] height) {
    int n = height.length;
    int i = 0, j = n - 1;             //Take two pointers representing two pillars at extreme end.
    int max = 0;                    // initialize max volue to 0.
    while (i < j) {                     // when pillars are apart.
        int min_pillar = Math.min(height[i], height[j]);   //water level can be maintained only  till height of smaller pillar
        max = Math.max(max, min_pillar * (j - i));            // Volume = min pillar height * distance between pillars

        if (height[i] <= height[j]) {               // move the smaller pillar towards the other one.
            i++;
        } else {
            j--;
        }
    } //while

    return max;
}
}
