.class public Lr6/u;
.super Lr6/c;

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public final transient a:Lr6/s;


# direct methods
.method public constructor <init>(Lr6/f0;Ljava/util/Comparator;)V
    .locals 0

    invoke-direct {p0}, Lr6/c;-><init>()V

    iput-object p1, p0, Lr6/u;->a:Lr6/s;

    if-nez p2, :cond_0

    sget p1, Lr6/t;->c:I

    sget-object p1, Lr6/g0;->p:[Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-static {p2}, Lr6/v;->r(Ljava/util/Comparator;)Lr6/h0;

    :goto_0
    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lr6/s;
    .locals 1

    invoke-virtual {p0}, Lr6/u;->b()Lr6/s;

    move-result-object v0

    return-object v0
.end method

.method public b()Lr6/s;
    .locals 1

    iget-object v0, p0, Lr6/u;->a:Lr6/s;

    return-object v0
.end method
