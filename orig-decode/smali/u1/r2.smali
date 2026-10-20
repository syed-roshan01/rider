.class public final Lu1/r2;
.super Ljava/lang/Object;

# interfaces
.implements Lt1/m1;


# instance fields
.field public final a:I

.field public final b:Ljava/util/List;

.field public c:Ljava/lang/Float;

.field public d:Ljava/lang/Float;

.field public e:Ly1/h;

.field public f:Ly1/h;


# direct methods
.method public constructor <init>(ILjava/util/ArrayList;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lu1/r2;->a:I

    iput-object p2, p0, Lu1/r2;->b:Ljava/util/List;

    const/4 p1, 0x0

    iput-object p1, p0, Lu1/r2;->c:Ljava/lang/Float;

    iput-object p1, p0, Lu1/r2;->d:Ljava/lang/Float;

    iput-object p1, p0, Lu1/r2;->e:Ly1/h;

    iput-object p1, p0, Lu1/r2;->f:Ly1/h;

    return-void
.end method


# virtual methods
.method public final w()Z
    .locals 1

    iget-object v0, p0, Lu1/r2;->b:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
