.class public abstract Lr1/j;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lu0/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Lr1/i;->a:Lr1/i;

    new-instance v1, Lu0/b;

    const v2, -0x67cddd26

    const/4 v3, 0x0

    invoke-direct {v1, v2, v0, v3}, Lu0/b;-><init>(ILd9/j;Z)V

    sput-object v1, Lr1/j;->a:Lu0/b;

    return-void
.end method
