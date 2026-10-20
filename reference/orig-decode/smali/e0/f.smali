.class public abstract Le0/f;
.super Ljava/lang/Object;


# static fields
.field public static final a:Le0/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le0/d;

    const/16 v1, 0x32

    int-to-float v1, v1

    invoke-direct {v0, v1}, Le0/d;-><init>(F)V

    new-instance v1, Le0/e;

    invoke-direct {v1, v0, v0, v0, v0}, Le0/a;-><init>(Le0/b;Le0/b;Le0/b;Le0/b;)V

    sput-object v1, Le0/f;->a:Le0/e;

    return-void
.end method

.method public static final a(F)Le0/e;
    .locals 1

    new-instance v0, Le0/c;

    invoke-direct {v0, p0}, Le0/c;-><init>(F)V

    new-instance p0, Le0/e;

    invoke-direct {p0, v0, v0, v0, v0}, Le0/a;-><init>(Le0/b;Le0/b;Le0/b;Le0/b;)V

    return-object p0
.end method

.method public static b(FFFFI)Le0/e;
    .locals 2

    and-int/lit8 v0, p4, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    int-to-float p0, v1

    :cond_0
    and-int/lit8 v0, p4, 0x2

    if-eqz v0, :cond_1

    int-to-float p1, v1

    :cond_1
    and-int/lit8 v0, p4, 0x4

    if-eqz v0, :cond_2

    int-to-float p2, v1

    :cond_2
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_3

    int-to-float p3, v1

    :cond_3
    new-instance p4, Le0/e;

    new-instance v0, Le0/c;

    invoke-direct {v0, p0}, Le0/c;-><init>(F)V

    new-instance p0, Le0/c;

    invoke-direct {p0, p1}, Le0/c;-><init>(F)V

    new-instance p1, Le0/c;

    invoke-direct {p1, p2}, Le0/c;-><init>(F)V

    new-instance p2, Le0/c;

    invoke-direct {p2, p3}, Le0/c;-><init>(F)V

    invoke-direct {p4, v0, p0, p1, p2}, Le0/a;-><init>(Le0/b;Le0/b;Le0/b;Le0/b;)V

    return-object p4
.end method
