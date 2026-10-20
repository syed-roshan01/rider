.class public final Lr6/y;
.super Lr6/z;

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final a:Lr6/y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr6/y;

    invoke-direct {v0}, Lr6/z;-><init>()V

    sput-object v0, Lr6/y;->a:Lr6/y;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ljava/lang/Comparable;

    check-cast p2, Ljava/lang/Comparable;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Ordering.natural()"

    return-object v0
.end method
