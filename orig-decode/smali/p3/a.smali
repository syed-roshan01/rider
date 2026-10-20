.class public abstract Lp3/a;
.super Landroid/content/BroadcastReceiver;


# static fields
.field public static final a:Landroid/util/SparseArray;

.field public static b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Lp3/a;->a:Landroid/util/SparseArray;

    const/4 v0, 0x1

    sput v0, Lp3/a;->b:I

    return-void
.end method
