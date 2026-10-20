.class public final Lk9/m;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Iterable;
.implements Le9/a;


# instance fields
.field public final synthetic a:Lk9/i;


# direct methods
.method public constructor <init>(Ll9/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk9/m;->a:Lk9/i;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, Lk9/m;->a:Lk9/i;

    invoke-interface {v0}, Lk9/i;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
