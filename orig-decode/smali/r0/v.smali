.class public final Lr0/v;
.super Lr0/s;


# instance fields
.field public final d:Lr0/i;


# direct methods
.method public constructor <init>(Lr0/i;)V
    .locals 0

    invoke-direct {p0}, Lr0/s;-><init>()V

    iput-object p1, p0, Lr0/v;->d:Lr0/i;

    return-void
.end method


# virtual methods
.method public final next()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lr0/s;->c:I

    add-int/lit8 v1, v0, 0x2

    iput v1, p0, Lr0/s;->c:I

    new-instance v1, Lr0/c;

    iget-object v2, p0, Lr0/s;->a:[Ljava/lang/Object;

    aget-object v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    aget-object v0, v2, v0

    iget-object v2, p0, Lr0/v;->d:Lr0/i;

    invoke-direct {v1, v2, v3, v0}, Lr0/c;-><init>(Lr0/i;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method
