package org.example.algorithms.greedy;

import java.util.Scanner;

class KObject {
    float w;
    float p;
    float r;
}

public class KnapsackGreedy {
    static final int MAX = 20;
    static int n;
    static float M;

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of objects: ");
        n = scanner.nextInt();
        KObject[] obj = new KObject[n];
        for (int i = 0; i < n; i++)
            obj[i] = new KObject();
        ReadObjects(obj);
        Knapsack(obj);
        scanner.close();
    }

    static void ReadObjects(KObject obj[]) {
        KObject temp = new KObject();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the max capacity of knapsack: ");
        M = scanner.nextFloat();
        System.out.println("Enter Weights: ");
        for (int i = 0; i < n; i++)
            obj[i].w = scanner.nextFloat();
        System.out.println("Enter Profits: ");
        for (int i = 0; i < n; i++)
            obj[i].p = scanner.nextFloat();
        for (int i = 0; i < n; i++)
            obj[i].r = obj[i].p / obj[i].w;

        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - 1 - i; j++)
                if (obj[j].r < obj[j + 1].r) {
                    temp = obj[j];
                    obj[j] = obj[j + 1];
                    obj[j + 1] = temp;
                }
        scanner.close();
    }

    static void Knapsack(KObject kobj[]) {
        float x[] = new float[MAX];
        float totalprofit;
        int i;
        float U;
        U = M;
        totalprofit = 0;
        for (i = 0; i < n; i++)
            x[i] = 0;
        for (i = 0; i < n; i++) {
            if (kobj[i].w > U)
                break;
            else {
                x[i] = 1;
                totalprofit = totalprofit + kobj[i].p;
                U = U - kobj[i].w;
            }
        }
        System.out.println("i = " + i);
        if (i < n)
            x[i] = U / kobj[i].w;
        totalprofit = totalprofit + (x[i] * kobj[i].p);
        System.out.println("The Solution vector, x[]: ");
        for (i = 0; i < n; i++)
            System.out.print(x[i] + " ");
        System.out.println("\nTotal profit is = " + totalprofit);
    }
}

