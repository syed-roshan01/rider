.class public final Lz/h0;
.super Ljava/lang/Object;

# interfaces
.implements Lr1/k0;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ljava/util/Map;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    const/4 v0, 0x1

    sget-object v1, Lr8/s;->a:Lr8/s;

    if-eq p1, v0, :cond_0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lz/h0;->c:Ljava/util/Map;

    return-void

    .line 3
    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lz/h0;->c:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(IILjava/util/Map;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lz/h0;->a:I

    iput p2, p0, Lz/h0;->b:I

    iput-object p3, p0, Lz/h0;->c:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lz/h0;->b:I

    return v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lz/h0;->a:I

    return v0
.end method

.method public final d()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lz/h0;->c:Ljava/util/Map;

    return-object v0
.end method

.method public final e()V
    .locals 0

    return-void
.end method
