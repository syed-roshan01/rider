.class public final Landroidx/lifecycle/d0;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ls4/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object p1, p1, Ls4/o;->a:Ljava/util/Map;

    invoke-static {p1}, Lr8/v;->I0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    iput-object p1, p0, Landroidx/lifecycle/d0;->a:Ljava/util/HashMap;

    return-void
.end method
